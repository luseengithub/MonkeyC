package ee.edio.garmin.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.Disposable;
import ee.edio.garmin.MonkeyCModuleBuilder;

import javax.swing.*;

public class MCModuleWizardStep extends ModuleWizardStep {
  private final MCAppPropertiesEditor myAppPropertiesEditor;

  private JPanel myPanel;


  public MCModuleWizardStep(MonkeyCModuleBuilder moduleBuilder, WizardContext context, Disposable parentDisposable) {
    myAppPropertiesEditor = new MCAppPropertiesEditor(moduleBuilder.getName(), context.getModulesProvider());

    myPanel = new JPanel();
    myPanel.setLayout(new OverlayLayout(myPanel));
    myPanel.add(myAppPropertiesEditor.getContentPanel());
  }

  @Override
  public JComponent getComponent() {
    return myPanel;

  }

  @Override
  public void updateDataModel() {

  }
}
