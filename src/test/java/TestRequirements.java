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
    public void testAddList() {
        /*
        == PSEUDOCODE ==
        expected = new List("untitled");
        appModel.addList(expected);
        list = appModel.getList(first list);
        assertEqual(expected, actual);
         */
    }

    @Test
    public void testRemoveList() {
        /*
        == PSEUDOCODE ==
        list1 = new List("untitled");
        list2 = new List("untitled2");
        appModel.addList(list1);
        appModel.addList(list2);
        appModel.removeList(list1);
        assertEqual(list2, appModel.getList(first list));
         */
    }

    @Test
    public void testEditListTitle() {
        /*
        == PSEUDOCODE ==
        list = new List("some title");
        list.setTitle("another title");
        assertEqual("another title", list.getTitle());
         */
    }

    @Test
    public void testAddItemToList() {
        /*
        == PSEUDOCODE ==
        list = new List("untitled");
        item = new Item("description", "2021-10-10", false)
        list.add(item);
        assertEqual(item, list.getItem(0));
         */
        List list = new List("untitled");
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
    public void testSaveAllLists() {
        /*
        == PSEUDOCODE ==
        list1.setFile(new File("list1.list"));
        list1.add(new Item(3, "some item", "2021-10-10", true));
        list2.setFile(new File("list2.list"));
        list2.add(new Item(3, "some other item", "2021-10-10", true));
        appModel.addList(list1);
        appModel.addList(list2);
        appModel.saveAllLists();
        assertEqual("3|some item|2021-10-10|true", readFile("list1.list"));
        assertEqual("3|some other item|2021-10-10|true", readFile("list2.list"));
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

    @Test
    public void testLoadMultipleLists() {
        /*
        == PSEUDOCODE ==
        writeFile("3|some item|2021-10-10|true", "someList1.list");
        writeFile("3|some item|2021-10-10|true", "someList2.list");
        lists = List.loadMultipleLists({ "someList1.list", "someList2.list" });
        for (list in lists) {
            assertNotNull(list.getItem(3));
            assertEqual("some item", list.getItem(3).description);
            assertEqual("2021-10-10", list.getItem(3).dueDate);
            assertTrue(list.getItem(3).completed);
        }
         */
    }

}
