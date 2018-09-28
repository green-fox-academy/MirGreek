
var addForm = document.querySelector('.add-form');
var cancelButton = document.querySelector('.cancel-form');
var addButton = document.querySelector('.add-todo');

addButton.addEventListener('click',function(){
    addForm.style.display = 'inline-block'
})

cancelButton.addEventListener('click',function(){
    addForm.style.display = 'none'
})