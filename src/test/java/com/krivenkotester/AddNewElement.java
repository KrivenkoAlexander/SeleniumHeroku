package com.krivenkotester;

import org.testng.annotations.Test;

import static Pages.AddElementPage.*;


public class AddNewElement extends BaseTest {

    @Test
    public void checkThatAddBtnIsExist() {
        openAddElementPage().addBtnsVisible();
    }

    @Test
    public void addOneNewElement() {
        openAddElementPage().addNewElement()
                            .elementIsExist()
                            .elementIsVisible();

    }

    @Test
    public void AddSeveralElements() {
        openAddElementPage().addNewElement()
                            .addNewElement()
                            .listOfElementsIsVisible()
                            .listOfElementsHasSize(2);
    }
}
