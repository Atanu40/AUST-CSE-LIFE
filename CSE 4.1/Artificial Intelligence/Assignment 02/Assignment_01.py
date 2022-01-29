def Sum(first_term, interval, num_of_terms):
    if num_of_terms == 0:
        return 0
    else:
        return first_term + Sum((first_term + interval), interval, num_of_terms - 1)


N = int(input("How many time: "))
for i in range(N):
    print("Iteration :", i+1)
    first_term = int(input("Enter first Number :"))
    interval = int(input("Interval :"))
    num_of_terms = int(input("Number of Terms:"))
    print("\nSum of Series is :", Sum(first_term, interval, num_of_terms))
