def get_input_collected(num, sub):
    print("""
            Saving >>>>>>>>>>>>>>>>>>>>>
            Saved successfully
          """)

    student_grade = [[0] * sub for _ in range(num)]

    for index in range(num):
        for count in range(sub):
            print(f"Enter score for student {index + 1}: ")
            student_grade[index][count] = int(input(f"Enter student score in Subject {count + 1}: "))

            print("""
                Saving >>>>>>>>>>>>>>>>>>>>>
                Saved successfully
              """)
        print()

    return student_grade


def get_student_chart(num, sub):
    bubble_sorting = [0] * num
    total_position = [0] * num
    new_positioning = [0] * num

    score_inputs = get_input_collected(num, sub)

    print("==============================================================================================================================================")
    print("SUBJECT \t", end="")
    for index in range(sub):
        print(f"SUB{index + 1} \t ", end="")
    print("TOT \t AVE \t POS")
    print("===============================================================================================================================================")

    for index in range(num):
        total = sum(score_inputs[index])
        average = total / sub
        bubble_sorting[index] = total
        total_position[index] = total

        print(f"STUDENT {index + 1} ", end="")
        for score in score_inputs[index]:
            print(f"\t {score}", end="")
        print(f"\t{total}\t{average:.2f}")

    print("==============================================================================================================================================")

    for index in range(1, len(bubble_sorting)):
        for count in range(1, len(bubble_sorting)):
            if bubble_sorting[count] < bubble_sorting[count - 1]:
                bubble_sorting[count], bubble_sorting[count - 1] = bubble_sorting[count - 1], bubble_sorting[count]

    for index in range(len(bubble_sorting)):
        counter = 1
        for count in range(len(bubble_sorting)):
            if total_position[index] < bubble_sorting[count]:
                counter += 1
        new_positioning[index] = counter

    for display in new_positioning:
        print(display)


def main():
    try:
        number_of_students = int(input("How many number of students do you have? "))
        number_of_subjects = int(input("How many subjects do they offer? "))

        if number_of_students > 0:
            if number_of_subjects > 0:
                get_student_chart(number_of_students, number_of_subjects)
            else:
                print("Invalid Input")
        else:
            print("Oga Haffa you now!!")

    except ValueError:
        print("Invalid input")



main()
