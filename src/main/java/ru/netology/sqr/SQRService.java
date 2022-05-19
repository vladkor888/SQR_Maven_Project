package ru.netology.sqr;

public class SQRService {
    public int calculateSqrNumber(int minValue, int maxValue) {
        int totalNumber = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > minValue && i * i < maxValue) {
                totalNumber++;
            }
        }
        return (totalNumber);
    }
}
