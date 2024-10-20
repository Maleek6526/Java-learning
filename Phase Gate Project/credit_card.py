def get_modified_string(card):
	modified_card_number = card.replace(" ", "").replace("_", "")
	length = len(modified_card_number)

	if 13 <= length <= 16:
		if modified_card_number.startswith("4"):
			card_type = "Visa Card"
			print("**Credit Card Number: "+str(length))
		elif modified_card_number.startswith("5"):
			card_type = "MasterCard"
			print("**Credit Card Number: "+str(length))
		elif modified_card_number.startswith("37"):
			card_type = "American Express Card"
			print("**Credit Card Number: "+str(length))
		elif modified_card_number.startswith("6"):
			card_type = "Discover Card"
			print("**Credit Card Number: "+str(length))
		else:
			card_type = "Invalid Card"
	else:
		return "Invalid Credit Card!"

	return modified_card_number, card_type, length


def get_converted_int_credit_card(modified_card):
	return int(modified_card)


def get_odd_and_even_indexes(modified_card):
	data = str(get_converted_int_credit_card(modified_card))
	array_double_converted_int_credit_card = []

	for index, digit in enumerate(data):
		num = int(digit)
		if (len(data) % 2 == 0 and index % 2 == 0) or (len(data) % 2 == 1 and index % 2 != 0):
			double_num = num * 2
			if double_num > 9:
				double_num -= 9
				array_double_converted_int_credit_card.append(double_num)
			else:
				array_double_converted_int_credit_card.append(num)

	return array_double_converted_int_credit_card


def check_validity(modified_card):
	check_validity = get_odd_and_even_indexes(modified_card)
	total_array_sum = sum(check_validity)

	if total_array_sum % 10 == 0:
		return "**Credit Card Validity Status: Valid"
	else:
		return "**Credit Card Validity Status: Invalid"


card_number = input("Hello, kindly enter card details to verify: ")
modified_card, card_type, length = get_modified_string(card_number)

if modified_card:
	print(f"**Credit Card Type: {card_type}")
	print(f"**Credit Card Digit Length: {length}")
	validity_status = check_validity(modified_card)
	print(validity_status)
