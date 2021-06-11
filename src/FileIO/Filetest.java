package FileIO;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Filetest {

    @Test
    public void test0() {
    	FileIO fio =  new FileIO();
        assertThat(fio.makeFile("temp.txt"),is(0));
        assertThat(fio.deleteFile("temp.txt"),is(0));
    }
    @Test
    public void test1() {
    	FileIO fio =  new FileIO();
    	fio.makeFile("same.txt");
        assertThat(fio.makeFile("same.txt"),is(1));
        fio.deleteFile("same.txt");
    }
    @Test
    public void test2() {
    	FileIO fio =  new FileIO();
        assertThat(fio.deleteFile("absent.txt"),is(1));
    }
}
