//
//  ViewController.swift
//  LAB 4
//
//  Created by Carlie Charp on 9/26/19.
//  Copyright © 2019 Carlie Charp. All rights reserved.
//

import UIKit

class ViewController: UIViewController, UITextFieldDelegate {

    @IBOutlet weak var checkAmount: UITextField!
    @IBOutlet weak var savePercent: UITextField!
    @IBOutlet weak var saveDue: UILabel!
    @IBOutlet weak var moneyInEach: UILabel!
    
    @IBOutlet weak var accountStepper: UIStepper!
    @IBOutlet weak var accountLabel: UILabel!
    
    func textFieldShouldReturn(_ textField: UITextField) -> Bool {
        textField.resignFirstResponder()
        return true
    }
    
    @IBAction func updateAccout(_ sender: UIStepper) {
        if accountStepper.value == 1 {
            accountLabel.text = "1 Account"
        } else {
            accountLabel.text = String(format: "%.0f", accountStepper.value) + " account"
        }
        updateMoneyInAccount()
    }
    
    func updateMoneyInAccount() {
        var amount:Float //check amount
        var pct:Float //percentage to save
        
        if checkAmount.text!.isEmpty {
            amount = 0.0
        } else {
            amount = Float(checkAmount.text!)!
        }
        if savePercent.text!.isEmpty {
            pct = 0.0
        }
        else {
            pct = Float(savePercent.text!)!/100
        }
    
        let numberOfAccounts = accountStepper.value
        let save=amount*pct
        let total=save
        
        var accountTotal : Float = 0.0
        
        if numberOfAccounts > 0 {
            accountTotal = total / Float(numberOfAccounts)
        }else {
            
            let alert=UIAlertController(title: "Warning", message: "The number of accounts must be greater than 0", preferredStyle: UIAlertController.Style.alert)
            
            let cancelAction=UIAlertAction(title: "Cancel", style:UIAlertAction.Style.cancel, handler: nil)
            alert.addAction(cancelAction)
            let okAction=UIAlertAction(title: "OK", style: UIAlertAction.Style.default, handler: {action in
                self.accountStepper.value = 1
                self.accountLabel.text? = "1 account"
                self.updateMoneyInAccount()
            })
            alert.addAction(okAction)
            present(alert, animated: true, completion: nil)
        } //end else
    
    
        let currencyFormatter = NumberFormatter()
        currencyFormatter.numberStyle=NumberFormatter.Style.currency
        saveDue.text=currencyFormatter.string(from: NSNumber(value: save))
        
        moneyInEach.text=currencyFormatter.string(from: NSNumber(value: accountTotal))
    }
    
    func textFieldDidEndEditing(_ textField: UITextField) {
        updateMoneyInAccount()
    }
    
    override func viewDidLoad() {
        checkAmount.delegate=self
        savePercent.delegate=self
        super.viewDidLoad()
        
    }
    
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }


}

