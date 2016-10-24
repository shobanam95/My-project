<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Registration</title>

 <meta name="viewport" content="width=device-width, initial-scale=1"> 
             <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" > 
             <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script> 
             <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" ></script>
</head>
<style>
    .error {
        color: red; font-weight: bold;
    }
    
</style>
<body>



<body>
    <div align="center">
        <form:form  action="addregister" method="post" commandName="user">
            <table>
               
                <tr>
                    <td>FirstName</td>
                    <td><form:input path="firstname"  /></td>
                </tr>
                <tr>
                <td><form:label path="lastname">Last Name:</form:label></td>
                   
                    <td><form:input path="lastname" /></td>
                </tr>
                 <tr>
                 <td>Password: </td>
                <td><form:password path="password" size="30"/></td>
                    <td><form:errors path="password" cssClass="error"/></td>
                </tr>
                <tr>
                 <td><form:label path="confirm_password">Confirm Password:</form:label></td>
                
                    <td><form:password path="confirm_password" /></td>
                </tr>
                <tr>
                <td><form:label path="email">E-mail:</form:label></td>
                  
                    <td><form:input path="email" /></td>
                </tr>
                
                
                
             
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
</body>
</html>