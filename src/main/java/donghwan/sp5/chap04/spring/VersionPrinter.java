package donghwan.sp5.chap04.spring;

import lombok.Setter;

@Setter
public class VersionPrinter {

    private int majorVersion;
    private int minorVersion;

    public void print() {
        System.out.printf("This program version is %d.%d\n", majorVersion, minorVersion);
    }
}
