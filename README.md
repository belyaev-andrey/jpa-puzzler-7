# JPA Puzzler 7 - Spring Data Repositories Method Naming

There might be a confusion if an entity property and child class name+property are similar. Try to run the app first time and then 
add the `phoneNumber` column to the `Owner` entity and copy `V6___` script to the `db.migration` folder to update the DB.
`OwnerRepository#findOwnersByPhoneNumber()` method won't find the owner which was found during the first run.