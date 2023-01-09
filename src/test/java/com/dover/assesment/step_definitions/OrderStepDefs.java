package com.dover.assesment.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class OrderStepDefs extends BaseStep {

    @Given("the user navigates to {string} page")
    public void the_user_navigates_to_page(String string) {
        pages.webOrdersPage().navigateTo(string);
    }


    //| Customer name | Street  | City     | State    | Zip   |
    @When("the user enters address information:")
    public void the_user_enters_address_information(List<Map<String, String>> dataTable) {
        Map<String, String> values = dataTable.get(0);
        pages.orderPage().enterAddressInformation(values.get("Customer name"),
                values.get("Street"),
                values.get("City"),
                values.get("State"),
                values.get("Zip"));
    }

    // | Card | Card Nr:  | Expire date (mm/yy) |
    @When("the user enters payment information:")
    public void the_user_enters_payment_information(List<Map<String, String>> dataTable) {
        Map<String, String> paymentInfo = dataTable.get(0);
        pages.orderPage().enterPaymentInformation(paymentInfo.get("Card"),
                paymentInfo.get("Card Nr:"),
                paymentInfo.get("Expire date (mm/yy)"));
    }


    // | Product   | Quantity | Price per unit | Discount |
    @When("the user enters product information:")
    public void the_user_enters_product_information(List<Map<String, String>> dataTable) {
        Map<String, String> values = dataTable.get(0);
        pages.orderPage().setProductType(values.get("Product"));
        pages.orderPage().enterQuantity(values.get("Quantity"));
        pages.orderPage().enterPricePerUnit(values.get("Price per unit"));
        pages.orderPage().enterDiscount(values.get("Discount"));
    }


    @When("the user click on calculate button")
    public void the_user_click_on_calculate_button() {
        pages.orderPage().clickToCalculate();
    }


    @Then("the user should verify that total {int} is displayed")
    public void the_user_should_verify_that_total_is_displayed(Integer totalValue) {
        Assert.assertEquals(String.valueOf(totalValue), pages.orderPage().getTotal());
    }

    @Then("the user click on process button")
    public void the_user_click_on_process_button() {
        pages.orderPage().clickOnProcessButton();

    }


}
