<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank Details-FMS</title>
<link rel="stylesheet" type="text/css" href="bankDetailsCss.css">

</head>

<body>
    <div id="register">
        <div id="user_register">
        <h3 align = "center">BANK DETAILS</h3>
        </div>
        <div id= "form">
        <form method="post" action="bankDetails.lti">
            <table align="center" cellpadding = "10">
                

            <!----- Cardtype----------------------------------------------------------->
            <tr>
            <td>CARDTYPE</td>
            <td>
            Gold<input  type="radio" name="Cardtype" value="Gold" />
            Titanium <input type="radio" name="Cardtype" value="Titanium" />
            </td>
            </tr>
            
            <!----- Select Bank---------------------------------------------------------->
            <tr>
            <td>SELECT BANK</td>
            <td>
            <select id="inputarea" id="Select_Bank" name="Select_Bank">
                <option value="-1">Select Bank</option>
                <option value="ICICI_Bank">ICICI Bank</option>
                <option value="Standard_Chartered">Standard Chartered</option>
                <option value="HSBC_Bank">HSBC Bank</option>
                <option value="Axis_Bank">Axis Bank</option>
                <option value="IDBI_Bank">IDBI Bank</option>
                <option value="State_Bank_of_India">State Bank of India</option>
                <option value="HDFC_Bank">HDFC Bank</option>
                <option value="Kotak_Mahindra_Bank">Kotak Mahindra Bank</option>
                <option value="Indian_Overseas_Bank">Indian Overseas Bank</option>
                <option value="Central_Bank_of_India">Central Bank of India</option>
                <option value="Bank_of_Baroda">Bank of Baroda</option>
                <option value="Bank_of_Maharashtra">Bank of Maharashtra</option>
                </select>
                
            </td>
            </tr>
            
            <!----- SAVINGS ACCOUNT NUMBER ---------------------------------------------------------->
            <tr>
                <td>SAVINGS ACCOUNT NUMBER</td>
                <td>
                <input id="inputarea" type="text" name="Account_Number" maxlength="20" />
                </td>
                </tr>
            
            <!----- IFSC CODE !!!---------------------------------------------------------->
            
            <tr>
                <td>IFSC CODE</td>
                <td>
                <input id="inputarea" type="text" name="IFSC_CODE" maxlength="20" />
                </td>
                </tr>
            
            
            <!----- Submit and Reset ------------------------------------------------->
            <tr>
            <td colspan="2" align="center">
            
            <button class="button button1" type="submit">REGISTER</button>
            <button class="button button1" type="reset" value="reset">RESET</button>
            </td>
            </tr>
            </table>
            <div id= "Already">
                Already a member?<a href="loginPage.jsp">Login here</a>
            </div>
          
        </form>
          </div>
    </div>
</body>

</html>