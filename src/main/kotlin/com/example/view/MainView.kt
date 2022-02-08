package com.example.view

import tornadofx.*

class MainView : View("My View") {

    val controller: CustomerController by inject()
    var tableViewEditModel: TableViewEditModel<Customer> by singleAssign()

    override val root =  borderpane {
        top = buttonbar {
            button("COMMIT").setOnAction {
                tableViewEditModel.commit()
            }
            button("ROLLBACK").setOnAction {
                tableViewEditModel.rollback()
            }
        }
        center = tableview<Customer> {
            items = controller.customers
            isEditable = true

            column("ID",Customer::idProperty)
            column("FIRST NAME", Customer::firstNameProperty).makeEditable()
            column("LAST NAME", Customer::lastNameProperty).makeEditable()

            enableCellEditing() //enables easier cell navigation/editing
            enableDirtyTracking() //flags cells that are dirty

            tableViewEditModel = editModel
        }
    }
}