# Restaurant-billing-system
Java project created in Eclipse at 22.05.2019.

My project is build un OOP paradigm. It contains parents, child classes and inheritances.
User is able to choose few of position in restaurant menu. Menu is splited for categories like main dishes, starters, drinks etc.
Every dish have price setted as double in SuperClass_Parent.
Tax for every dish is stand at 10% of price.
Price of order is divided for: cost of meal, cost of drinks and total cost.
Subtotal of order is extended for tax(10%) which is equal for TOTAL.
After collecting an order user have to choose active buttons. There are 6 options:
Total - summ up an order. Calculate amount of bill.
Check - generate bill on text area.
Reset - turns every field on a start value.
Exit - leave an aplication. This function is secured by JoptionPane with an ask to confirm closing.
Save.txt - allows user to save generated bill in txt file. Exactly "C:\\Users\\user\\Desktop\\filename.txt".
Print - as it is named. Printing a check.
