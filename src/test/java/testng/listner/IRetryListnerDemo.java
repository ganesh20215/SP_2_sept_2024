package testng.listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryListnerDemo implements IRetryAnalyzer {

    int start = 0;
    int end = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        while (start < end) {
            start++;
            return true;
        }
        return false;
    }
}
