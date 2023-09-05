@Permissions&Msistaff
Feature: This is Super admin permissions & Msi staff listing page

  Scenario: Changing the roles from Admin to super admin
    Given super admin launch the url & login to the account
    When super admin checks the MSI Staff page
    When Admin log in to the active inactive diabled account
    When super admin switch admin account to super admin account
    When new Super admin log in to the account
    When super admin switch the account to admin account
    When super admin account changed to admin account
    When super admin disable the new super admin account
    When super admin enable the disabled admin account
