def get_modified_string(card):
    about_to_modify = card
    modified_card_number = about_to_modify.replace(" ", "").replace("_", "")
    length = len(modified_card_number)

    if 13 <= length <= 16:
        if modified_card_number.startswith("4"):
            print("**Credit Card Type: Visa Card")
        elif modified_card_number.startswith("5"):
            print("**Credit Card Type: MasterCard Card")
        elif modified_card_number.startswith("37"):
            print("**Credit Card Type: American Express Card")
        elif modified_card_number.startswith("6"):
            print("**Credit Card Type: Discover Card")
        else:
            print("**Credit Card Type: Invalid Card")

        print(f"**Credit Card Digit Length: {length}")
        print(f"**Credit Card Number: {modified_card_number}")
    else:
        print("Invalid Credit Card!")

    return modified_card_number

def get_converted_int_credit_card(modified_card):
    already_modified = get_modified_string(modified_card)
    converted_int_credit_card = [int(char) for char in already_modified]
    return converted_int_credit_card

def get_odd_and_even_indexes(elements):
    data = get_converted_int_credit_card(elements)
    array_double_converted_int_credit_card = [0] * len(data)

    for count in range(len(data)):
        if len(data) % 2 == 0:
            if count % 2 == 0:
                double_converted_int_credit_card = data[count] * 2
                if double_converted_int_credit_card > 9:
                    double_converted_int_credit_card -= 9
                array_double_converted_int_credit_card[count] = double_converted_int_credit_card
            else:
                array_double_converted_int_credit_card[count] = data[count]
        elif len(data) % 2 == 1:
            if count % 2 != 0:
                double_converted_int_credit_card = data[count] * 2
                if double_converted_int_credit_card > 9:
                    double_converted_int_credit_card -= 9
                array_double_converted_int_credit_card[count] = double_converted_int_credit_card
            else:
                array_double_converted_int_credit_card[count] = data[count]

    return array_double_converted_int_credit_card

def check_validity(validity):
    check_validity = get_odd_and_even_indexes(validity)
    total_array_sum = sum(check_validity)

    if total_array_sum % 10 == 0:
        return "**Credit Card Validity Status: Valid"
    else:
        return "**Credit Card Validity Status: Invalid"

try:
    card_number = input("Hello, Kindly Enter Card details to verify: ")
    print(check_validity(card_number))
except Exception:
    print("Invalid Input")
