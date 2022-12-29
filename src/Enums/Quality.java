package Enums;

import Products.Product;

public enum Quality{
    NORMAL("����������", 1.2),
    SLIGHTLY_DAMAGED("������ ��������", 0.95),
    HALF_DAMAGED("�������� ���������", 0.75),
    BAD("��������", 0.55),
    TRASH("����", 0.2);

    private String name;
    private double coefficient;

    Quality(String name, double coefficient) {
        this.name = name;
        this.coefficient = coefficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
}
