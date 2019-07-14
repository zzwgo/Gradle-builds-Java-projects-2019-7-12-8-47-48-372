package gradleTest;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class mainTest {

    @Test
    public void testReturnValueDependentOnMethodParameter()  {
        Comparable c= mock(Comparable.class);
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        // 断言
        assertEquals(1,c.compareTo("Mockito"));
    }
@Test
    public void testVerify() throws Exception {
        //mock creation
    LinkedList mockedList = mock(LinkedList.class);

        //using mock object
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("two");
          mockedList.add("two");
        mockedList.clear();

        //verification
        verify(mockedList).add("one");//验证是否调用过一次 mockedList.add("one")方法，若不是（0次或者大于一次），测试将不通过
//至少2次
    verify(mockedList, atLeast(2)).add("two");

        verify(mockedList, times(2)).add("two");
        //验证调用过2次 mockedList.add("two")方法，若不是，测试将不通过
        verify(mockedList).clear();//验证是否调用过一次 mockedList.clear()方法，若没有（0次或者大于一次），测试将不通过
    }


    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);
    }
}