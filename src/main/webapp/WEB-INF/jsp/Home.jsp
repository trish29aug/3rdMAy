<br>
<br>
<br>
<h2>Hello World!</h2>
	<div class="col-sm-6">
		Home area
	</div>
	<div class="col-sm-6 panel panel-success" style="padding-right:0px;padding-left:0px;">
		<ul class="nav nav-tabs">
		    <li class="active"><a data-toggle="tab" href="#loginDiv">Login</a></li>
		    <li><a data-toggle="tab" href="#signUpDiv">SignUp</a></li>
		</ul>
	  	<div class="tab-content panel-body">
		    <div id="loginDiv" class="tab-pane fade in active">
		    	<form action="login" id="loginForm">
					<div class="input-group">
				      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				      <input type="text" class="form-control" name="userId" id="userId" placeholder="UserID">
				    </div>
				    <div class="input-group">
				      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
				      <input id="loginPassword" type="password" class="form-control" name="loginPassword" placeholder="Password">
				    </div>
				    <br>
				    <div class="input-group">
				    	<button type="submit" class="btn btn-primary form-control">Login</button>
				    </div>
				</form>
		    </div>
		    <div id="signUpDiv" class="tab-pane fade">
		    	<form action="signUp" id="signingForm">
					<div class="input-group">
				      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				      <input id="email" type="text" class="form-control" name="email" placeholder="Email">
				    </div>
				    <div class="input-group">
				      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				      <input id="fname" type="text" class="form-control" name="fname" placeholder="First Name">
				    </div>
				    <div class="input-group">
				      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				      <input id="lname" type="text" class="form-control" name="lname" placeholder="Last Name">
				    </div>
				    <div class="input-group">
				      <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				      <input id="age" type="text" class="form-control" name="age" placeholder="Age">
				    </div>
				    <div class="input-group">
				      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
				      <input id="password" type="password" class="form-control" name="signUpPassword" id="signUpPassword" placeholder="Password">
				    </div>
				    <div class="input-group">
				      <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
				      <input id="password" type="password" class="form-control" name="re_enter" placeholder="Re-enter Password">
				    </div>
				    <br>
				    <div class="input-group">
				    	<button type="submit" class="btn btn-primary form-control">Sign Up</button>
				    </div>
				</form>
		    </div>
		</div>
	</div>
