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
                    <a class="nav-link active" aria-current="page" href="Birth.jsp">job</a>
                    <a class="nav-link" href="#">Pricing</a>
                    <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                </div>
            </div>
    </div>
</nav>
</nav>
<h1>job Application...</h1>
<form action="Birth Certificate" method="post">
    <pre>
    <div class="col-md-4">
        <label for="validationDefault01" class="form-label">Birth Id</label>
        <input type="number" class="form-control" id="validationDefault01" name="id" required>
    </div>
     <div class="col-md-3">
        <label for="validationDefault02" class="form-label">Hospital Name</label>
        <select class="form-select" id="validationDefault02" name="hospital" required>
            <option selected disabled value="">Choose...</option>
            <option>McGann Teaching District Hospital</option>
            <option>Nanjappa Hospital</option>
            <option>Sarji Hospital</option>
            <option>Atharva Ayurveda Hospital</option>
        </select>
    </div>
        <label for="validationDefaultUsername" class="form-label">Father Name</label>
            <input type="text" class="form-control" id="validationDefaultUsername" name="father" required>
    </div>
    <div class="col-md-6">
        <label for="validationDefault04" class="form-label">Mother Name</label>
        <input type="text" class="form-control" id="validationDefault04" name="mother" required>

        <div class="col-md-6">
        <label for="validationDefault05" class="form-label">Date and Time</label>
        <input type="datetime-local" class="form-control" id="validationDefault05" name="datetime" required>
    </div>
        <div class="col-md-6">
        <label for="validationDefault06" class="form-label">Doctor Name</label>
        <input type="text" class="form-control" id="validationDefault06" name="doctor" required>
    </div>
        <div class="col-md-6">
        <label for="validationDefault07" class="form-label">Nurse Name</label>
        <input type="text" class="form-control" id="validationDefault07" name="nurse" required>
    </div>

    <div class="col-md-3">
        <label for="validationDefault08" class="form-label">Hospital Type</label>
        <select class="form-select" id="validationDefault08" name="type" required>
            <option selected disabled value="">Choose...</option>
            <option>general hospitals</option>
            <option>specialty hospitals</option>
            <option>specialty hospitals</option>
            <option>clinics</option>
        </select>
    </div>
    <div class="col-12">
        <button class="btn btn-primary" type="submit">Submit form</button>
    </div>
        </pre>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</body>
</html>