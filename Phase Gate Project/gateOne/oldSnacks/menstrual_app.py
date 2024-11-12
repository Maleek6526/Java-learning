from datetime import datetime, timedelta

def get_ovulation_period(date, length):
    ovulation = 14
    return date + timedelta(days=ovulation)

def get_next_period_date(date, length):
    return date + timedelta(days=length)

def get_fertile_window(date, length):
    ovulation = 14
    fertile_calculation_before_ovulation = ovulation - 3
    fertile_calculation_after_ovulation = ovulation + 3

    fertile_window = [
        date + timedelta(days=fertile_calculation_before_ovulation),
        date + timedelta(days=fertile_calculation_after_ovulation)
    ]
    
    return fertile_window

def get_safe_period(date, length):
    my_ovulation = get_next_period_date(date, length)
    safe_start = my_ovulation - timedelta(days=7)
    safe_end = my_ovulation + timedelta(days=length)
    
    return [safe_start, safe_end]

def get_flow_date(date, range, length):
    if length > 28:
        print("Please this cycle length seems abnormal, go and see a doctor!")

    if range < 3 or range > 7:
        print("Please menstrual range seems abnormal")

    flow_date = get_next_period_date(date, length)
    flow_start = flow_date - timedelta(days=range)
    flow_end = flow_date
    
    return [flow_start, flow_end]

if __name__ == "__main__":
    try:
        users_name = input("Please enter your name: ")
        users_start_date = input("The start date of the last period in this format (yyyy-mm-dd): ")
        users_circle_length = int(input("Please enter your circle length: "))
        menstrual_range = int(input("Please how many days does your menstruation take: "))

        start_date = datetime.strptime(users_start_date, "%Y-%m-%d")

        print("Hi " + users_name)
        print("Your next ovulation period is " + str(get_ovulation_period(start_date, users_circle_length)))
        print("Your next period date is " + str(get_next_period_date(start_date, users_circle_length)))

        fertile_window = get_fertile_window(start_date, users_circle_length)
        print("Your fertile window starts from " + str(fertile_window[0]) + " to " + str(fertile_window[1]))

        safe_period = get_safe_period(start_date, users_circle_length)
        print("Your safe period starts from " + str(safe_period[0]) + " to " + str(safe_period[1]))

        flow_dates = get_flow_date(start_date, menstrual_range, users_circle_length)
        print("Your flow date starts from " + str(flow_dates[0]) + " to " + str(flow_dates[1]))

    except Exception:
        print("Invalid input, try again!")
