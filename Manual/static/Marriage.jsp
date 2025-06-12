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
                    <a class="nav-link active" aria-current="page" href="Marriage.jsp">job</a>
                    <a class="nav-link" href="#">Pricing</a>
                    <a class="nav-link disabled" aria-disabled="true">Disabled</a>
                </div>
            </div>
    </div>
</nav>
</nav>
<h1>job Application...</h1>
<form action="Marriage Certificate" method="post">
    <pre>
    <div class="col-md-4">
        <label for="validationDefault01" class="form-label">Groom Name</label>
        <input type="text" class="form-control" id="validationDefault01" name="Groomname" required>
    </div>
    <div class="col-md-4">
        <label for="validationDefault02" class="form-label">Bride name</label>
        <input type="text" class="form-control" id="validationDefault02" name="Bridename" required>
    </div>
    <div class="col-md-4">
        <label for="validationDefaultUsername" class="form-label">Location</label>
            <input type="text" class="form-control" id="validationDefaultUsername" name="Location" required>
    </div>
    <div class="col-md-6">
        <label for="validationDefault03" class="form-label">Address</label>
        <input type="text" class="form-control" id="validationDefault03" name="Address" required>
    </div>
    <div class="col-md-3">
        <label for="validationDefault04" class="form-label">Religion</label>
        <select class="form-select" id="validationDefault04" name="Religion" required>

            <option selected disabled value="">Choose...</option>
            <option>Hindu</option>
            <option>Muslim</option>
            <option>Christian</option>
            <option>Jain</option>

    </div>
         <div class="col-md-3">
        <label for="validationDefault05" class="form-label">Date</label>
        <input type="Date" id="validationDefault05" name="date" required>
         </div>

        <div class="col-md-3">
        <label for="validationDefault06" class="form-label">Witness 1</label>
        <input type="text" id="validationDefault06" name="Witness1" required>
        </div>
        <div class="col-md-3">
        <label for="validationDefault07" class="form-label">Witness 2</label>
        <input type="text" id="validationDefault07" name="Witness2" required>
        </div>
        <div class="col-md-3">
        <label for="validationDefault08" class="form-label">Officer Present</label>
        <input type="text" id="validationDefault08" name="Officer" required>
        </div>




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