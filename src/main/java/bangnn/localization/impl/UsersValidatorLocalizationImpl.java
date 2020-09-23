/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangnn.localization.impl;

import bangnn.utils.validator.impl.UsersValidatorImpl;
import java.util.ResourceBundle;

/**
 *
 * @author bangmaple
 */
public class UsersValidatorLocalizationImpl extends GenericLocalizationImpl {

    public UsersValidatorLocalizationImpl() {
        super.init();
    }

    @Override
    public void loadLocalizationProperties() {
        ResourceBundle resource = ResourceBundle
                .getBundle("localization/UsersValidatorImpl", getLocale());
        UsersValidatorImpl.loadInternationalizationResources(resource);
    }
    
}
