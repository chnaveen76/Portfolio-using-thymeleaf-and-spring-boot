document.addEventListener('DOMContentLoaded', () => {
    const navLinks = document.querySelectorAll('.nav-links a');

    navLinks.forEach(link => {
        link.addEventListener('click', (e) => {
            e.preventDefault();
            const sectionId = e.target.textContent.trim().toLowerCase();
            document.getElementById(sectionId).scrollIntoView({ behavior: 'smooth' });
        });
    });

    const buttons = document.querySelectorAll('.intro-box button');
    buttons[1].addEventListener('click', () => {
        document.getElementById('contact').scrollIntoView({ behavior: 'smooth' });
    });
});


document.addEventListener('DOMContentLoaded', function() {
    const navToggle = document.querySelector('.toggle-button');
    const navLinks = document.querySelector('.nav-links');

    navToggle.addEventListener('click', function() {
        navLinks.classList.toggle('active');
    });
});