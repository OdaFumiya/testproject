package bubblesort;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Bubbletest {
    /*
     * 異常系と正常系を判別したい。
     * test0-3は正常系
     * test4- は異常系とする。
     * 
     * 判別には何が必要？
     * 
     * 
     * 
     * 
     * ・引数の型が異なる
     * ・例外の処理を呼び出している
     * 
     * 
     * */
    @Test
    public void test0() {
        int[] a= {3,2,1};
        int[] b= {1,2,3};
        Bubblesort bubble =  new Bubblesort();
        assertThat(bubble.sort(a), is(b));
    }
    @Test
    public void test1() {
        int[] a= {1,2,3};
        int[] b= {1,2,3};
        Bubblesort bubble =  new Bubblesort();
        assertThat(bubble.sort(a), is(b));
    }
    @Test
    public void test2() {
        int[] a= {1,2,1};
        int[] b= {1,1,2};
        Bubblesort bubble =  new Bubblesort();
        assertThat(bubble.sort(a), is(b));
    }
    @Test
    public void test3() {
        int[] a= {3};
        int[] b= {3};
        Bubblesort bubble =  new Bubblesort();
        assertThat(bubble.sort(a), is(b));
    }
    @Test
    public void test4() {
        int[] a= {};
        int[] b= {};
        Bubblesort bubble =  new Bubblesort();
        assertThat(bubble.sort(a), is(b));
    }
    @Test
    public void test5() {
        int[] a= null;
        int[] b= null;
        Bubblesort bubble =  new Bubblesort();
        assertThat(bubble.sort(a), is(b));
    }
}