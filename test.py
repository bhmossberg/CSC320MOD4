def get_valid_input():
    while True:
        user_input = input("Enter a number between 1 and 10: ")
        if user_input.isdigit():
            num = int(user_input)
            if 1 <= num <= 10:
                return num
        print("Invalid input. Please try again.")
if __name__ == "__main__":
    valid_number = get_valid_input()
    print(f"You entered: {valid_number}") 