package ee.edio.garmin.dom.sdk.projectinfo;

import com.intellij.util.xml.GenericAttributeValue;

public interface File extends ProjectInfoDomElement {
  GenericAttributeValue<String> getType();

  String getValue();
}
