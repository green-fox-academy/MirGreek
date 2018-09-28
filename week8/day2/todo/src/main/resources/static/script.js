
var addForm = document.querySelector('.add-form');
var cancelButton = document.querySelector('.cancel-form');
var addButton = document.querySelector('.add-todo');
var formMask = document.querySelector('.mask')


addButton.addEventListener('click',function(){
    addForm.style.display = 'inline-block'
    formMask.style.display = 'inline-block'
})

cancelButton.addEventListener('click',function(){
    addForm.style.display = 'none'
    formMask.style.display = 'none'
})