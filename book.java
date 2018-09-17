package com.company;
        class Book {
            private int year;
            private String name;
            public Book()
            {
                year = 0;
                name = "no";
            }
            public Book(int getSize, String getColor)
            {
                year = getSize;
                name = getColor;
            }
            public int getSize()
            {
                return year;
            }
            public void setSize(int arg)
            {
                year = arg;
            }
            public String getColor()
            {
                return name;
            }
            public void setColor(String arg)
            {
                name = arg;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Book book = new Book(211, "green");
                System.out.println("book " + book.getSize() + " " + book.getColor());
            }
        }
