	function validation(frm) {
		frm.vflag.value="yes";
		
		var name = frm.pname.value;
		var age = frm.page.value;

		if (name == "") {
			alert("person name is req");
			frm.pname.focus();
			return false;
		}
		if (age == "") {
			alert("person age is req");
			frm.page.focus();
			return false;
		}
		else 
		{
			if (isNaN(age)) 
			{
				alert("age must be a numeric value");
				frm.page.focus();
				return false;
			}
			else if(age<=0 || age>=126)
				{
					alert("age must be in range of 1-125");
					frm.page.focus();
					return false;
				}
			
		}
	
	  	  
	}