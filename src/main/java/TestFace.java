import jdk.nashorn.internal.objects.annotations.Function;

import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;

public interface TestFace {
    Class<Class<NullPointerException>> getClassOfNPEClass(Void nothing);
    TestFace faceTheFace(TestFace faceOfTest);
    Void Void (Void Void);
}
