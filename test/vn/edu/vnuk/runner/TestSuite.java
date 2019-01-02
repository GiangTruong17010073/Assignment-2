package vn.edu.vnuk.runner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import vn.edu.vnuk.model.CasualWorkerTest;
import vn.edu.vnuk.model.LecturesTest;
import vn.edu.vnuk.model.StaffTest;


@RunWith(Suite.class)

@Suite.SuiteClasses({
   CasualWorkerTest.class,
   LecturesTest.class,
   StaffTest.class
})

public class TestSuite {  
}