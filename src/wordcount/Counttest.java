package wordcount;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Counttest {

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
        Wordcount wc =  new Wordcount();
        assertThat(wc.count("This is test"), is(3));
    }
    @Test
    public void test1() {
        Wordcount wc =  new Wordcount();
        assertThat(wc.count(" "), is(0));
    }
    @Test
    public void test2() {
        Wordcount wc =  new Wordcount();
        assertThat(wc.count("これは てすと です"), is(3));
    }
    @Test
    public void test3() {
        Wordcount wc =  new Wordcount();
        assertThat(wc.count(""), is(0));
    }
    @Test
    public void test4() {
        Wordcount wc =  new Wordcount();
        assertThat(wc.count(null), is(0));
    }
@test(expected = NullNameException.class)
public void nullShopNameTest(){
	Shop s1 = new Shop(null);
}

@test
public void addProductTest(){
	Product p1 = new Product("hoge",10);
	Shop s1 = new Shop("foo");
	foo.addProduct(p1);
	assertThat(foo.getNumberOfProduct(), is(1));
}

@test
public void addSomeProductsTest(){
	Product p1 = new Product("hoge",10);
	Product p2 = new Product("piyo",20);
	Product p3 = new Product("fuga",30);
	Shop s1 = new Shop("foo");
	foo.addProduct(p1);
	foo.addProduct(p2);
	foo.addProduct(p3);
	assertThat(foo.getNumberOfProduct(), is(3));
}

@test(expected = NullProductException.class)
public void addNullProductTest(){
	Shop s1 = new Shop("foo");
	foo.addProduct(null);
}

@test
public void addSameNameProductsTest(){
	Product p1 = new Product("hoge",10);
	Product p2 = new Product("hoge",20);
	Product p3 = new Product("hoge",30);
	Shop s1 = new Shop("foo");
	foo.addProduct(p1);
	foo.addProduct(p2);
	foo.addProduct(p3);
	assertThat(foo.getNumberOfProduct(), is(3));
}

@test(expected = LongNameException.class)
public void longShopNameTest(){
	Shop s1 = new Shop("thisIsTooLongNameExample");
}
}
