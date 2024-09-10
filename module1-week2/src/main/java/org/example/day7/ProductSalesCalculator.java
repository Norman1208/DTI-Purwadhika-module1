package org.example.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ProductSalesCalculator {
    // this method  initiate the file processing by constructing the file path
    public void result() throws FileNotFoundException {
        // dynamicall construct the file path to the CSV file
        String filePath = System.getProperty("user.dir")
                + "\\module1-week2\\src\\main\\java"
                + "\\org.example\\day7\\product_sales_data.csv";

        // call the method to process the file
        processTheFile(filePath);
    }

    // method processes the file to calculate total sales, total product, etc
    private void processTheFile(String filePath) throws FileNotFoundException {
        String productMostBought = "", productLeastBought = "";
        int highestSold = Integer.MIN_VALUE, // initialize to a very low value to track highest sold product
            lowestSold = Integer.MAX_VALUE, //initialize to a very high value to track least sold product
            totalProductSold = 0; // sum of all product sold

        double totalSales = 0.0; // total sales amount

        //user scanner to read the file line by line
        Scanner scannerFile = new Scanner(new File(filePath));

        // Loop through the file line by line
        while (scannerFile.hasNextLine()) {
            String line = scannerFile.nextLine(); // read the line
            String[] row = line.split(","); // split the line by commas

            // ensure that the row is not empty
            if (row.length == 0){
                throw new FileNotFoundException(); // throw expention if file is empty
            } else {
                try {
                    // parse the quantity sold and item price from the row
                    int totalSold = Integer.parseInt(row[1]);
                    double itemPrice = Double.parseDouble(row[2]);

                    // calculate the cumulative product sold and sales amount
                    totalProductSold += totalSold;
                    totalSales += (totalSold * itemPrice);

                    // track the product with highest sold quantity
                    if (highestSold < totalSold) {
                        highestSold = totalSold;
                        productMostBought = row[0];
                    }

                    // track the product with the lowest sold quantity
                    if (lowestSold > totalSold) {
                        lowestSold = totalSold;
                        productLeastBought = row[0];
                    }
                } catch (NumberFormatException e) {
                    // if the number is valid, continue processing the next row
                    continue;
                }
            }
        }

        // print the final result
        System.out.println("Total sales: $"+ String.format("%.2f", totalSales));
        System.out.println("Total product sold: "+ totalProductSold);
        System.out.println("Most Bought Product: "+ productMostBought);
        System.out.println("Least Bought Product: " + productLeastBought);
    }

    // this method parses the contents of the CSV and stores the data in two maps
    private List<Map<String, ?>> parseContents(String filePath) {
        List<Map<String, ?>> result = new ArrayList<>(); // list to store maps of product data
        HashMap<String, Integer> totalSold = new HashMap<>(); // map to store product and its total sold quantity
        HashMap<String, Double> itemPrice = new HashMap<>(); // Map to store product and its price

        try {
            Scanner scannerFile = new Scanner(new File(filePath));// read file
            boolean headerSkipped = false; // flag to skip CSV header

            // Loop through each line in the file
            while (scannerFile.hasNextLine()) {
                if (!headerSkipped) {
                    headerSkipped = true; // skip the first line
                } else {
                    String line = scannerFile.nextLine(); // read the next line
                    String[] row = line.split(",");

                    // store the total sold and price for each product
                    totalSold.put(row[0], Integer.parseInt(row[1]));
                    itemPrice.put(row[0], Double.parseDouble(row[2]));
                    System.out.println("Content: "+line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Some column not found");
        } catch (NumberFormatException e) {
            System.out.println("File content is not a number");
        } catch (Exception e) {
            System.out.println("Global exception");
        } finally {
            System.out.println("File reading done");
        }

        // add the two maps (totalsold and itemprice) to the result list
        result.add(totalSold);
        result.add(itemPrice);
        return result;
    }
}
