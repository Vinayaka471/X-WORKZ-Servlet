<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary" style="background-color: #e3f2fd;" data-bs-theme="light">

    <!-- Navbar content -->

    <div class="container-fluid">
        <nav class="navbar" style="background-color: green;" data-bs-theme="light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                    <a class="nav-link active" aria-current="page" href="Passport.jsp">job</a>
                    <a class="nav-link" href="#">Pricing</a>
                    <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                </div>
            </div>
    </div>
</nav>
</nav>
<h1>job Application...</h1>
<form action="Passport Application" method="post">
    <pre>
    <div class="col-md-4">
        <label for="validationDefault01" class="form-label">Applicant Name</label>
        <input type="text" class="form-control" id="validationDefault01" name="name" required>
    </div>
    <div class="col-md-4">
        <label for="validationDefault02" class="form-label">Aadhar No</label>
        <input type="number" class="form-control" id="validationDefault02" name="aadhar" required>
    </div>
    <div class="col-md-4">
        <label for="validationDefaultUsername" class="form-label">Address</label>
            <input type="text" class="form-control" id="validationDefaultUsername" name="address" required>
    </div>
    <div class="col-md-6">
        <label for="validationDefault03" class="form-label">Pan No</label>
        <input type="number" class="form-control" id="validationDefault03" name="pan" required>
    </div>
        <div class="col-md-6">
        <label for="validationDefault04" class="form-label">Country</label>
        <input type="text" class="form-control" id="validationDefault04" name="country" required>
    </div>
         <div class="col-md-6">
        <label for="validationDefault05" class="form-label">State</label>
        <input type="text" class="form-control" id="validationDefault05" name="state" required>
    </div>
         <div class="col-md-6">
        <label for="validationDefault06" class="form-label">City</label>
        <input type="text" class="form-control" id="validationDefault06" name="city" required>
    </div>
         <div class="col-md-6">
        <label for="validationDefault07" class="form-label">Pincode</label>
        <input type="number" class="form-control" id="validationDefault07" name="pin" required>
    </div>

    <div class="col-md-3">
        <label for="validationDefault08" class="form-label">Passport Type</label>
        <select class="form-select" id="validationDefault08" name="type" required>
            <option selected disabled value="">Choose...</option>
            <option>Ordinary Passport (blue)</option>
            <option> Diplomatic Passport (maroon)</option>
            <option>Official Passport (white)</option>
            <option>Emergency Certificate (grey</option>
        </select>
    </div>
         <div class="col-md-6">
        <label for="validationDefault09" class="form-label">Payment Reference No</label>
        <input type="number" class="form-control" id="validationDefault09" name="payment" required>
    </div>
    <div class="col-12">
        <button class="btn btn-primary" type="submit">Submit form</button>
    </div>
        </pre>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</body>
</html>