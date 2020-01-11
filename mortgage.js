function c(){
	
	var p = parseInt(document.getElementById("p").value);
	var y = parseInt(document.getElementById("y").value);
	var months = y*12;
	var i = parseInt(document.getElementById("i").value);
	var interest = (i / 100)/12;
	var r = (1 + interest);
	var m1 = interest * (Math.pow(r, months));
	var m2 = (Math.pow(r, months)) - 1;
	var mortgage =  p * (m1 / m2);
	var res = mortgage.toFixed(2);
	document.getElementById("r").value = res;
	
	
}

function remainingBalance() {
		var principal = parseInt(document.getElementById("p").value);
		var y = parseInt(document.getElementById("y").value);
		var i = parseInt(document.getElementById("i").value);
		var interest = (i / 100)/12;
		var balance;
		var months = y * 12;
		var b = document.getElementById("b"); // .value = "After " + i + " payment your mortgage is" + balance
		for (var i = 1; i <= months; i++) {
			var r = (1 + interest);
			balance = (principal * ((Math.pow(r, months)) - (Math.pow(r, i))))
					/ ((Math.pow(r, months)) - 1);
			var div = new Element('div');
			div.set("html", "This is the <code>div</element> inserted <em>after</em> the <code>p</code>");
			div.inject(b, 'after');
		}
	}
