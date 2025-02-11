package data.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    private Item itemManager;
    private Item item1; 
    private Item item2;

    @BeforeEach
    public void setUp() {
        itemManager = new Item("Manager", 0, "Manages Items", 0);
        item1 = new Item("Item1", 1, "Description1", 100);
        item2 = new Item("Item2", 2, "Description2", 200);
    }

    @Test
    public void testSaveItem() {
        itemManager.save(item1);
        itemManager.save(item2);

        assertEquals(2, itemManager.count());
        assertTrue(itemManager.getListOfItems().contains(item1));
        assertTrue(itemManager.getListOfItems().contains(item2));
    }

    @Test
    public void testDeleteItem() {
        itemManager.save(item1);
        itemManager.save(item2);

        itemManager.delete(item1);

        assertEquals(1, itemManager.count());
        assertFalse(itemManager.getListOfItems().contains(item1));
        assertTrue(itemManager.getListOfItems().contains(item2));
    }

    @Test
    public void testDeleteAllItems() {
        itemManager.save(item1);
        itemManager.save(item2);

        itemManager.deleteAll();

        assertEquals(0, itemManager.count());
        assertTrue(itemManager.getListOfItems().isEmpty());
    }

    @Test
    public void testDeleteItemById() {
        itemManager.save(item1);
        itemManager.save(item2);

        itemManager.deleteItemById(1);

        assertEquals(1, itemManager.count());
        assertFalse(itemManager.getListOfItems().contains(item1));
        assertTrue(itemManager.getListOfItems().contains(item2));
    }

    @Test
    public void testDeleteItemByIdNotFound() {
        itemManager.save(item1);
        itemManager.save(item2);

        itemManager.deleteItemById(3);

        assertEquals(2, itemManager.count());
        assertTrue(itemManager.getListOfItems().contains(item1));
        assertTrue(itemManager.getListOfItems().contains(item2));
    }

    @Test
    public void testCount() {
        assertEquals(0, itemManager.count());

        itemManager.save(item1);
        assertEquals(1, itemManager.count());

        itemManager.save(item2);
        assertEquals(2, itemManager.count());

        itemManager.delete(item1);
        assertEquals(1, itemManager.count());
    }

    @Test
    public void testFindAllWhenItemsAreAdded() {
        Item item1 = new Item("Item1", 1, "Description1", 100);
        Item item2 = new Item("Item2", 2, "Description2", 200);
        itemManager.save(item1);
        itemManager.save(item2);

        List<Item> result = itemManager.findAll();
        assertEquals(2, result.size());
        assertTrue(result.contains(item1));
        assertTrue(result.contains(item2));
    }


    @Test
    public void testThatItemExistsByID() {
        Item item1 = new Item("Item1", 1, "Description1", 100);
        Item item2 = new Item("Item2", 2, "Description2", 200);
        itemManager.save(item1);
        itemManager.save(item2);

        List<Item> result = itemManager.findAll();
        assertTrue(itemManager.existsById(1));
    }

    @Test
    public void testSaveAll() {
        List<Item> itemsToSave = new ArrayList<>();
        itemsToSave.add(new Item("Item 1", 2, "Description 1", 50));
        itemsToSave.add(new Item("Item 2", 3, "Description 2", 75));
        itemsToSave.add(new Item("Item 3", 4, "Description 3", 100));

        itemManager.saveAll(itemsToSave);

        assertEquals(3, itemManager.count());

        List<Item> savedItems = itemManager.findAll();
        for (int index = 0; index < itemsToSave.size(); index++) {
            assertEquals(itemsToSave.get(index).getName(), savedItems.get(index).getName());
            assertEquals(itemsToSave.get(index).getItemID(), savedItems.get(index).getItemID());
        }
    }

    @Test
    public void testDeleteAllById() {
        itemManager.save(item1);
        itemManager.save(item2);

        itemManager.deleteAllById(1);

        assertEquals(1, itemManager.count());
        assertFalse(itemManager.getListOfItems().contains(item1));
        assertTrue(itemManager.getListOfItems().contains(item2));
    }

    @Test
    public void updateExistingItem() {
        itemManager.save(item1);
        itemManager.save(item2);
        int itemIdToUpdate = 2;
        Item updatedItem = new Item("Updated Name", itemIdToUpdate, "Updated description", 200);

        itemManager.update(itemIdToUpdate, updatedItem);

        List<Item> items = itemManager.findAll();
        assertEquals(2, items.size());
        Item retrievedItem = items.get(1);
        assertEquals("Updated Name", retrievedItem.getName());
        assertEquals("Updated description", retrievedItem.getDescription());
        assertEquals(200, retrievedItem.getWeightInGram());
    }

    @Test
    public void updateNonExistingItem() {
        int nonExistingId = 9;
        Item updatedItem = new Item("Attempted Update", nonExistingId, "This should not be saved", 300);

        itemManager.update(nonExistingId, updatedItem);

        List<Item> items = itemManager.findAll();
        assertTrue(items.isEmpty());
    }
}