package org.example;

import java.nio.channels.ScatteringByteChannel;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDb {
    private final String url = "jdbc:postgresql://localhost:;5432/myFirstDb";
    private final String username;
    private final String password
    public ArrayList<Product> arrayList = new ArrayList<>();
    try {
        Class.forName("org.postgresql.Driver").getDeclaredConstructor().newInstance() {
            Statement statement = connection.createStatement();
            ResultSet resultSet statement.executeQuery("Select * from products");
            while (resultSet.next()){
                int id = resultSet.getInt(1)

            }
        }
    }


}