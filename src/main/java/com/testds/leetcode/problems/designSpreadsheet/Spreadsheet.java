//https://leetcode.com/problems/design-spreadsheet/
package com.testds.leetcode.problems.designSpreadsheet;

public class Spreadsheet {

    private final int[][] spreadsheet;

    public Spreadsheet(int rows) {
        this.spreadsheet = new int[rows][26];
    }

    public void setCell(String cell, int value) {
        Cell c = new Cell(cell);
        spreadsheet[c.row][c.col] = value;
    }

    public void resetCell(String cell) {
        Cell c = new Cell(cell);
        spreadsheet[c.row][c.col] = 0;
    }

    public int getValue(String formula) {
        int value = 0;
        if (formula.charAt(0) == '=') {
            formula = formula.substring(1);
        }
        for (String str : formula.split("\\+")) {
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                Cell c = new Cell(str);
                value += spreadsheet[c.row][c.col];
            } else {
                value += Integer.parseInt(str);
            }
        }
        return value;
    }

    private static final class Cell {
        int row;
        int col;

        Cell(String cell) {
            col = cell.charAt(0) - 'A';
            row = Integer.parseInt(cell.substring(1)) - 1;
        }
    }
}
