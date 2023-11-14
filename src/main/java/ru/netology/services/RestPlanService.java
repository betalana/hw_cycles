package ru.netology.services;
public class RestPlanService {
    public int calculate(int income, int expenses, int threshould) {
        int count = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshould) {
                money -= expenses;
                money /= 3;
                count++;
            } else {
                money += income;
                money -= expenses;
            }
        }

        return count;
    }
}
