package stack;

import java.util.Stack;

//Problem Statement :
//
//Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.
//
//The span of the stock's price in one day is the maximum number of consecutive days (starting from that day and going backward) for which the stock price was less than or equal to the price of that day.
//
//For example, if the prices of the stock in the last four days is [7,2,1,2] and the price of the stock today is 2, then the span of today is 4 because starting from today, the price of the stock was less than or equal 2 for 4 consecutive days.
//Also, if the prices of the stock in the last four days is [7,34,1,2] and the price of the stock today is 8, then the span of today is 3 because starting from today, the price of the stock was less than or equal 8 for 3 consecutive days.
//Implement the StockSpanner class:
//
//StockSpanner() Initializes the object of the class.
//int next(int price) Returns the span of the stock's price given that today's price is price.
//
//Example 1:
//
//Input
//["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
//[[], [100], [80], [60], [70], [60], [75], [85]]
//Output
//[null, 1, 1, 1, 2, 1, 4, 6]


class Stock{
    int price;
    int span;

    public Stock(int price, int span){
        this.price = price;
        this.span = span;
    }
}

class OnlineStockSpan {

    Stack<Stock> st;
    int prevPrice;
    public OnlineStockSpan() {
        st = new Stack<>();
        prevPrice = -1;
    }
    
    public int next(int price) {
        if(st.isEmpty()){
            st.push(new Stock(price,1));
            prevPrice = price;
        }
        else{
            int count = 1;
            while(!st.isEmpty() && st.peek().price<=price){
                count+=st.pop().span;
            }
            st.push(new Stock(price,count));
        }

        return st.peek().span;
    }
}
