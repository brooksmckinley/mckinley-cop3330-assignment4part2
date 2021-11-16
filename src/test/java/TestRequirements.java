/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucf.assignments.models.Item;
import ucf.assignments.models.List;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class TestRequirements {

    @Test
    public void testAddItemToList() {
        /*
        == PSEUDOCODE ==
        list = new List("untitled");
        item = new Item("description", "2021-10-10", false)
        list.add(item);
        assertEqual(item, list.getItem(0));
         */
        List list = new List();
        Item item = new Item(0, "description", "2021-10-10", false);
        list.addItem(item);
        Assertions.assertEquals(item, list.getItem(0));
    }

    @Test
    public void testRemoveItemFromList() {
        /*
        == PSEUDOCODE ==
        list = new List("untitled");
        item = new Item(0);
        list.add(item);
        list.remove(item);
        if (list.get(0) returns an item) {
            throw exception;
        }
        else test has passed
         */
        List list = new List();
        Item item = new Item("some description", "2021-10-10", false);
        int id = item.getID();
        list.addItem(item);
        Assertions.assertNotNull(list.getItem(id));
        list.removeItem(item.getID());
        Assertions.assertNull(list.getItem(id));
    }

    @Test
    public void testClearList() {
        /*
        == PSEUDOCODE ==
        list = new List();
        item = new Item(some arbitrary data);
        item2 = new Item(some arbitrary data);
        item3 = new Item(some arbitrary data);
        list.add(item);
        list.add(item2);
        list.add(item3);
        assert(list.size() == 3);
        list.clearList();
        assert(list.get(item, item2, item3) == null);
         */
        List list = new List();
        Item item = new Item("asjdklasd", "2021-10-10", false);
        Item item2 = new Item("uureureuri", "2021-10-11", false);
        Item item3 = new Item("nfffffjfjfjjfjf", "2021-10-12", true);
        list.addItem(item);
        list.addItem(item2);
        list.addItem(item3);
        Assertions.assertEquals(3, list.getAllItems().size());
        list.clearList();
        Assertions.assertEquals(0, list.getAllItems().size());
        Assertions.assertNull(list.getItem(item.getID()));
        Assertions.assertNull(list.getItem(item2.getID()));
        Assertions.assertNull(list.getItem(item3.getID()));
    }

    @Test
    public void testEditItemDescription() {
        /*
        == PSEUDOCODE ==
        item = new Item("old description");
        item.setDescription("new description");
        assertEqual("new description", item.description);
         */
        Item item = new Item("old description", "2021-10-10", false);
        item.setDescription("new description");
        Assertions.assertEquals("new description", item.getDescription());
    }

    @Test
    public void testEditItemDueDate() {
        /*
        == PSEUDOCODE ==
        item = new Item("2021-10-10");
        item.setDueDate("2021-11-11");
        assertEqual("2021-11-11", item.dueDate);
         */
        Item item = new Item("something", "2021-10-10", false);
        item.setDueDate("2021-11-11");
        Assertions.assertEquals("2021-11-11", item.getDueDate());
    }

    @Test
    public void setItemComplete() {
        /*
        == PSEUDOCODE ==
        item = new Item(false);
        item.setCompleted(true);
        assertTrue(item.completed);
        item.setCompleted(false);
        assertFalse(item.completed);
        */
        Item item = new Item("test description", "2021-10-10", false);
        item.setCompleted(true);
        Assertions.assertTrue(item.getCompleted());
        item.setCompleted(false);
        Assertions.assertFalse(item.getCompleted());
    }

    @Test
    public void testDisplayAllItems() {
        /*
        == PSEUDOCODE ==
        item1 = new Item(0, false);
        item2 = new Item(1, true);
        item3 = new Item(2, true);
        list.add(item1);
        list.add(item2);
        list.add(item3);

        allItems = list.getAllItems();
        assertTrue(allItems.contains(item1));
        assertTrue(allItems.contains(item2));
        assertTrue(allItems.contains(item3));
         */
        Item item1 = new Item(0, "some item 1", "2021-10-10", false);
        Item item2 = new Item(1, "some item 2", "2021-10-10", true);
        Item item3 = new Item(2, "some item 3", "2021-10-10", true);
        List list = new List();
        list.addItem(item1);
        list.addItem(item2);
        list.addItem(item3);

        ArrayList<Item> allItems = list.getAllItems();
        Assertions.assertTrue(allItems.contains(item1));
        Assertions.assertTrue(allItems.contains(item2));
        Assertions.assertTrue(allItems.contains(item3));
    }

    @Test
    public void testDisplayIncompleteItems() {
        /*
        == PSEUDOCODE ==
        item1 = new Item(0, false);
        item2 = new Item(1, true);
        item3 = new Item(2, true);
        list.add(item1);
        list.add(item2);
        list.add(item3);

        incompleteItems = list.getIncompleteItems();
        assertTrue(incompleteItems.contains(item1));
        assertFalse(incompleteItems.contains(item2));
        assertFalse(incompleteItems.contains(item3));
         */
        Item item1 = new Item(0, "some item 1", "2021-10-10", false);
        Item item2 = new Item(1, "some item 2", "2021-10-10", true);
        Item item3 = new Item(2, "some item 3", "2021-10-10", true);
        List list = new List();
        list.addItem(item1);
        list.addItem(item2);
        list.addItem(item3);

        ArrayList<Item> incompleteItems = list.getIncompleteItems();
        Assertions.assertTrue(incompleteItems.contains(item1));
        Assertions.assertFalse(incompleteItems.contains(item2));
        Assertions.assertFalse(incompleteItems.contains(item3));
    }

    @Test
    public void testDisplayCompletedItems() {
        /*
        == PSEUDOCODE ==
        item1 = new Item(0, false);
        item2 = new Item(1, true);
        item3 = new Item(2, true);
        list.add(item1);
        list.add(item2);
        list.add(item3);

        completedItems = list.getCompletedItems();
        assertFalse(completedItems.contains(item1));
        assertTrue(completedItems.contains(item2));
        assertTrue(completedItems.contains(item3));
         */
        Item item1 = new Item(0, "some item 1", "2021-10-10", false);
        Item item2 = new Item(1, "some item 2", "2021-10-10", true);
        Item item3 = new Item(2, "some item 3", "2021-10-10", true);
        List list = new List();
        list.addItem(item1);
        list.addItem(item2);
        list.addItem(item3);

        ArrayList<Item> completedItems = list.getCompletedItems();
        Assertions.assertFalse(completedItems.contains(item1));
        Assertions.assertTrue(completedItems.contains(item2));
        Assertions.assertTrue(completedItems.contains(item3));
    }

    @Test
    public void testSaveList() throws IOException {
        /*
        == PSEUDOCODE ==
        list.add(new Item(3, "some item", "2021-10-10", true));
        list.saveList();
        assertEqual("3|some item|2021-10-10|true", readFile("testSaveListFile.list"));
         */
        List list = new List();
        list.addItem(new Item(3, "some item", "2021-10-10", true));
        File output = new File("saveListTestFile.list");
        list.saveList(output);
        Assertions.assertEquals("3\u001Esome item\u001E2021-10-10\u001Etrue\n",
                Files.readString(output.toPath()));
    }

    @Test
    public void testLoadList() throws IOException {
        /*
        == PSEUDOCODE ==
        writeFile("3|some item|2021-10-10|true", "someList.list");
        list = List.loadList("someList.list");
        assertNotNull(list.getItem(3));
        assertEqual("some item", list.getItem(3).description);
        assertEqual("2021-10-10", list.getItem(3).dueDate);
        assertTrue(list.getItem(3).completed);
         */
        Files.writeString(new File("loadListTestFile.list").toPath(),
                "3\u001Esome item\u001E2021-10-10\u001Etrue");
        List list = List.loadList(new File("loadListTestFile.list"));
        Assertions.assertNotNull(list.getItem(3));
        Assertions.assertEquals("some item", list.getItem(3).getDescription());
        Assertions.assertEquals("2021-10-10", list.getItem(3).getDueDate());
        Assertions.assertTrue(list.getItem(3).getCompleted());
    }

}
