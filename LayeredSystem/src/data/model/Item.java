package data.model;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private int itemID;
    private String description;
    private int weightInGram;
    private List<Item> listOfItems = new ArrayList<>();
    private int count;

    public Item(String name, int itemID, String description, int weightInGram) {
        setName(name);
        setItemID(itemID);
        setDescription(description);
        setWeightInGram(weightInGram);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeightInGram() {
        return weightInGram;
    }

    public void setWeightInGram(int weightInGram) {
        this.weightInGram = weightInGram;
    }

    public int count() {
        return count;
    }

    public Item save(Item item) {
        listOfItems.add(item);
        count++;
        return item;
    }

    public void saveAll(List<Item> items) {
        for (Item item : items) {
            save(item);
        }
    }

    public void delete(Item item) {
        listOfItems.remove(item);
        count--;
    }

    public void deleteAll() {
        listOfItems.clear();
        count = 0;
    }

    public void deleteItemById(int itemID) {
        for (int index = 0; index < listOfItems.size(); index++) {
            Item item = listOfItems.get(index);
            if (item.getItemID() == itemID) {
                listOfItems.remove(index);
                count--;
                break;
            }
        }
    }
    public List<Item> getListOfItems() {
        return new ArrayList<>(listOfItems);
    }

    public List<Item> findAll() {
        return getListOfItems();
    }

    public boolean existsById(int id) {
        for (Item item : listOfItems) {
            if (item.getItemID() == id) {
                return true;
            }
        }
        return false;
    }

    public void deleteAllById(int itemID) {
        List<Item> itemsToRemove = new ArrayList<>();

        for (Item item : listOfItems) {
            if (item.getItemID() == itemID) {
                itemsToRemove.add(item);
            }
        }
        listOfItems.removeAll(itemsToRemove);
        count = listOfItems.size();
    }

    public void update(int id, Item updatedItem) {
        for (int index = 0; index < listOfItems.size(); index++) {
            Item existingItem = listOfItems.get(index);
            if (existingItem.getItemID() == id) {
                existingItem.setName(updatedItem.getName());
                existingItem.setDescription(updatedItem.getDescription());
                existingItem.setWeightInGram(updatedItem.getWeightInGram());
                System.out.println("Item with ID " + id + " updated successfully.");
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found in the list.");
    }
}