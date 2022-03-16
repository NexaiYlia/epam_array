package com.nexai.array.creator;

import com.nexai.array.creator.impl.ArrayCreatorImpl;
import com.nexai.array.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ArrayCreatorImplTest {
    public static final ArrayCreator creator = new ArrayCreatorImpl();

    @DataProvider(name = "create_array_data")
    public Object[][] createDataForCreateOneArray() {
        Object[][] data = new Object[4][2];
        data[0] = new Object[]{
                new int[]{3, 8, -7, 23, 0},
                new ArrayEntity(new int[]{3, 8, -7, 23, 0})
        };
        data[1] = new Object[]{
                new int[]{0, 20, -1},
                new ArrayEntity(new int[]{0, 20, -1})
        };
        data[2] = new Object[]{
                new int[]{0},
                new ArrayEntity(new int[]{0})
        };
        data[3] = new Object[]{
                new int[0],
                new ArrayEntity()
        };

        return data;
    }

    @DataProvider(name = "create_arrays_data")
    public Object[][] createDataForCreateListOfArrays() {
        List<int[]> listOfIntArrays = createListOfIntArrays();
        List<ArrayEntity> listOfCustomArrays = createListOfArrays();
        Object[][] data = new Object[1][2];
        data[0] = new Object[]{
                listOfIntArrays,
                listOfCustomArrays
        };
        return data;
    }

    @DataProvider(name = "stream_create_arrays_data")
    public Object[][] createDataForStreamCreateListOfArrays() {
        List<int[]> listOfIntArrays = createListOfIntArrays();
        List<ArrayEntity> listOfCustomArrays = createListOfArrays();
        Object[][] data = new Object[1][2];
        data[0] = new Object[]{
                listOfIntArrays,
                listOfCustomArrays
        };
        return data;
    }

    public List<int[]> createListOfIntArrays() {
        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(new int[]{4, -5, -3, 14, 4});
        listOfArrays.add(new int[]{14, -100, 0});
        listOfArrays.add(new int[]{0});
        listOfArrays.add(new int[0]);

        return listOfArrays;
    }

    public List<ArrayEntity> createListOfArrays() {
        List<ArrayEntity> listOfArrays = new ArrayList<>();
        listOfArrays.add(new ArrayEntity(new int[]{4, -5, -3, 14, 4}));
        listOfArrays.add(new ArrayEntity(new int[]{14, -100, 0}));
        listOfArrays.add(new ArrayEntity(new int[]{0}));
        listOfArrays.add(new ArrayEntity());

        return listOfArrays;
    }

    @Test
    public void testCreateDefaultCustomArray() {
        assertNotEquals(new ArrayEntity(), creator.createArrayEntity());
    }

    @Test(dataProvider = "create_array_data")
    public void testCreateOneArrayWithParam(int[] elements, ArrayEntity expected) {
        ArrayEntity actual = creator.createArrayEntity(elements);
        assertEquals(expected, actual);
    }
    @Test(dataProvider = "stream_create_arrays_data")
    public void testCreateListOfCustomArraysStream(List<int[]> elementsList, List<ArrayEntity> expected) {
        List<ArrayEntity> actual = creator.createListArrayEntityStream(elementsList);
        assertEquals(expected, actual);
    }
}







