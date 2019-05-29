## Restaurant-billing-system
Java project created in Eclipse at 22.05.2019.

My project is build in **OOP paradigm**. It contains parents, child classes and inheritances.

User is able to choose from few position on the restaurant menu. Menu is divided into categories e.g starters, main dishes, drinks etc.
Every dish has its price setted as double in SuperClass_Parent.
Tax for every dish stands at 10% of its price.
Price of order part is divided for: cost of meal, cost of drinks and total cost.
Subtotal cost of order complemented with for tax(10%) which equals TOTAL.

After collecting an order user have to choose active buttons. There are 6 options:

- Total - sum up an order. Calculate amount of bill.
- Check - generate bill on text area.
- Reset - turns every field on a start value.
- Exit - leave an aplication. This function is secured by JoptionPane with an ask to confirm closing.
- Save.txt - allows user to save generated bill in txt file. Exactly "C:\\Users\\user\\Desktop\\filename.txt".
- Print - as it is named. Printing a check.

Check method contains method of random select bill ID and random waiter name. It also get metod for an actual date and time.

![dimsum](https://user-images.githubusercontent.com/5953716/58388803-72381700-8023-11e9-89c4-006cbfba8cc3.png)
