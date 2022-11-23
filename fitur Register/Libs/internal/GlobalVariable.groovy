package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : URL</p>
     */
    public static Object URL
     
    /**
     * <p>Profile default : Email Positif</p>
     */
    public static Object mail
     
    /**
     * <p>Profile default : pass positif</p>
     */
    public static Object password
     
    /**
     * <p>Profile default : user positif</p>
     */
    public static Object username
     
    /**
     * <p>Profile default : mail negatif</p>
     */
    public static Object nagtif
     
    /**
     * <p>Profile default : gagal</p>
     */
    public static Object gagal
     
    /**
     * <p>Profile default : sandi gagal</p>
     */
    public static Object sandi
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            URL = selectedVariables['URL']
            mail = selectedVariables['mail']
            password = selectedVariables['password']
            username = selectedVariables['username']
            nagtif = selectedVariables['nagtif']
            gagal = selectedVariables['gagal']
            sandi = selectedVariables['sandi']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
