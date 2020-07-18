# Bank-Application

This application have following features:

 Read a .csv file of names, social security numbers, account type, and initial deposit
 Use a proper data structure to hold all these accounts
 Both savings and checking accounts share the following properties:
1. deposit() 
2. withdraw() 
3. transfer() 
4. showinfo()

 11 -Digit Account Number (generated with the following Process: 1 or 2 depending on Savings or Checking, last two digits of SSN, Unique 5 Digit Number and random 3-digit number)
 Savings Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
 Checking Account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN
 Both accounts will use an interface that determines the base interest rate.
1. Savings accounts will use .25 points less than the base rate
2. Checking accounts will use 15% of the base rate

 The Showlnfo method should reveal relevant account information as well as information specific to the Checking account or Savings account.