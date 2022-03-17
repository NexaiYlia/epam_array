package com.nexai.array.creator;

import com.nexai.array.creator.impl.ArrayCreatorImpl;
import com.nexai.array.entity.ArrayEntity;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ArrayCreatorImplTest {
    public static final ArrayCreator creator = new ArrayCreatorImpl();

    @DataProvider(name = "create_data")
    public Object[][] createOneArray() {
        Object[][] data = new Object[3][2];
        data[0] = new Object[]{
                new int[]{24, -19, -7, 112, 0},
                new ArrayEntity(new int[]{24, -19, -7, 112, 0})
        };
        data[1] = new Object[]{
                new int[]{0, 20, -1},
                new ArrayEntity(new int[]{0, 20, -1})
        };
        data[2] = new Object[]{
                new int[]{0},
                new ArrayEntity(new int[]{0})
        };

        return data;
    }

    @DataProvider(name = "create_all_data")
    public Object[][] createDataForListOfArrays() {
        List<int[]> listOfIntArrays = createListOfIntArrays();
        List<ArrayEntity> listOfArrays = createListOfArrays();
        Object[][] data = new Object[1][2];
        data[0] = new Object[]{
                listOfIntArrays,
                listOfArrays
        };
        return data;
    }

    @DataProvider(name = "stream_create_arrays_data")
    public Object[][] createDataForStreamCreateListOfArrays() {
        List<int[]> listOfIntArrays = createListOfIntArrays();
        List<ArrayEntity> listOfArrays = createListOfArrays();
        Object[][] data = new Object[1][2];
        data[0] = new Object[]{
                listOfIntArrays,
                listOfArrays
        };
        return data;
    }

    public List<int[]> createListOfIntArrays() {
        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(new int[]{24, -19, -7, 112, 0});
        listOfArrays.add(new int[]{0, 20, -1});
        listOfArrays.add(new int[]{0});
        listOfArrays.add(new int[0]);

        return listOfArrays;
    }

    public List<ArrayEntity> createListOfArrays() {
        List<ArrayEntity> listOfArrays = new ArrayList<>();
        listOfArrays.add(new ArrayEntity(new int[]{24, -19, -7, 112, 0}));
        listOfArrays.add(new ArrayEntity(new int[]{0, 20, -1}));
        listOfArrays.add(new ArrayEntity(new int[]{0}));
        listOfArrays.add(new ArrayEntity());

        return listOfArrays;
    }

    @Test
    public void testCreateDefaultCustomArray() {
        assertNotEquals(new ArrayEntity(), creator.createArrayEntity());
    }

    @Test(dataProvider = "create_data")
    public void createArrayEntityTest(int[] elements, ArrayEntity expected) {
        ArrayEntity actual = creator.createArrayEntity(elements);
        assertEquals(expected, actual);
    }

    @Test(dataProvider = "stream_create_arrays_data")
    public void testCreateListOfCustomArraysStream(List<int[]> elementsList, List<ArrayEntity> expected) {
        List<ArrayEntity> actual = creator.createListArrayEntityStream(elementsList);
        assertEquals(expected, actual);
    }
}



