const icon = document.querySelector('#icon');
const body = document.querySelector('body');
const date = document.querySelector('#date');
const currentDate = new Date();

const day = currentDate.getDate();
const month = currentDate.getMonth() + 1;
const year = currentDate.getFullYear();

date.textContent = `${day}/${month}/${year}`;

icon.addEventListener('click', () => {
    let class_list = icon.classList;
    let icon_name = class_list[class_list.length -1];

    if(icon_name === 'fa-sun'){
        icon.classList.remove('fa-sun');
        icon.classList.add('fa-moon');
        body.classList.add('dark-mode');
    }else if(icon_name === 'fa-moon'){
        icon.classList.remove('fa-moon');
        icon.classList.add('fa-sun');
        body.classList.remove('dark-mode');
    } 
});


