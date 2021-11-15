/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brooks McKinley
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucf.assignments.models.Item;
import ucf.assignments.models.List;

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
    }

    @Test
    public void testEditItemDueDate() {
        /*
        == PSEUDOCODE ==
        item = new Item("2021-10-10");
        item.setDueDate("2021-11-11");
        assertEqual("2021-11-11", item.dueDate);
         */
    }

    @Test
    public void setItemComplete() {
        /*
        == PSEUDOCODE ==
        item = new Item(false);
        item.setCompleted(true);
        assertTrue(item.completed);
        */
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
    }

    @Test
    public void testSaveList() {
        /*
        == PSEUDOCODE ==
        list.add(new Item(3, "some item", "2021-10-10", true));
        list.setFile(new File("somefile.list"));
        list.saveList();
        assertEqual("3|some item|2021-10-10|true", readFile("somefile.list"));
         */
    }

    @Test
    public void testLoadList() {
        /*
        == PSEUDOCODE ==
        writeFile("3|some item|2021-10-10|true", "someList.list");
        list = List.loadList("someList.list");
        assertNotNull(list.getItem(3));
        assertEqual("some item", list.getItem(3).description);
        assertEqual("2021-10-10", list.getItem(3).dueDate);
        assertTrue(list.getItem(3).completed);
         */
    }

}
