<h2>Spring MVC file upload example</h2>

<form method="POST" action="<c:url value='/upload' />"
    enctype="multipart/form-data">


    Please select a file to upload : <input type="file" name="file" />
    <a href="${SITE_URL}/upload"><input type="submit" value="upload" /></a>

</form>