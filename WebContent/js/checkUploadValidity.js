const uploadCodeForm = document.querySelector("#my-awesome-dropzone");
const uploadCodeBtn = document.querySelector("#uploadCodeBtn");
const uploadCodeLangSelect = document.querySelector("#languageSelect");
const uploadCodeFormFile = document.querySelector("#my-awesome-dropzone-file");

uploadCodeBtn.disabled = true;

uploadCodeLangSelect.addEventListener("change", function(e) {
	if(uploadCodeLangSelect.value != 0 && uploadCodeFormFile.value != "")
		uploadCodeBtn.disabled = false;
});

uploadCodeFormFile.addEventListener("change", function(e) {
	if(uploadCodeLangSelect.value != 0 && uploadCodeFormFile.value != "")
		uploadCodeBtn.disabled = false;
});

	
uploadCodeBtn.addEventListener("submit", function(e) {
	e.preventDefault();
})